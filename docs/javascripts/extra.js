/* Small progressive-enhancement helpers; the site remains usable without JavaScript. */
document.addEventListener("DOMContentLoaded", () => {
  // Add a friendly current-year marker to any element with this class.
  document.querySelectorAll("[data-current-year]").forEach((node) => {
    node.textContent = new Date().getFullYear();
  });

  // Persist the learner's checklist state locally in this browser.
  document.querySelectorAll('input[type="checkbox"]').forEach((checkbox, index) => {
    const key = `springboot-lab-check-${location.pathname}-${index}`;
    const saved = localStorage.getItem(key);
    if (saved !== null) checkbox.checked = saved === "true";
    checkbox.addEventListener("change", () => {
      localStorage.setItem(key, String(checkbox.checked));
    });
  });

  // Animate progress bars when they enter the viewport.
  const bars = document.querySelectorAll("[data-progress]");
  const reveal = (bar) => {
    const value = Math.max(0, Math.min(100, Number(bar.dataset.progress) || 0));
    bar.style.width = `${value}%`;
  };
  if ("IntersectionObserver" in window) {
    const observer = new IntersectionObserver((entries) => {
      entries.forEach((entry) => {
        if (entry.isIntersecting) {
          reveal(entry.target);
          observer.unobserve(entry.target);
        }
      });
    }, { threshold: 0.2 });
    bars.forEach((bar) => observer.observe(bar));
  } else {
    bars.forEach(reveal);
  }
});
